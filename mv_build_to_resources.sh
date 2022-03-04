#!/bin/bash

# Deletes "static" folder in "resources" if it exists,
# and cp the "build" folder to "resources" and rename it to "static"

rm -rf ./kreftregisteret-backend/src/main/resources/static \
&& cp -R ./kreftregisteret-frontend/build ./kreftregisteret-backend/src/main/resources/static
