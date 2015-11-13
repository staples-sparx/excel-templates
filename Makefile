.PHONY:	clean env test deploy deps

ARCHIVA_USERNAME = $(shell grep access_key ~/.s3cfg | head -n1 | awk -F ' = ' '{print $$2 }')
ARCHIVA_PASSPHRASE = $(shell grep secret_key ~/.s3cfg | head -n1 | awk -F ' = ' '{print $$2}')

LEIN_ENV = ARCHIVA_USERNAME="$(ARCHIVA_USERNAME)" ARCHIVA_PASSPHRASE="$(ARCHIVA_PASSPHRASE)"

LEIN = lein

all: test

clean:
	$(LEIN_ENV) $(LEIN) clean

env:
	@echo $(LEIN_ENV)

deps:
	$(LEIN_ENV) $(LEIN) deps

test: 
	$(LEIN_ENV) $(LEIN) test

deploy:
	$(LEIN_ENV) $(LEIN) deploy
