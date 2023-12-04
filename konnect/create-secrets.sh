kubectl create secret tls kong-cluster-cert -n konnect-kong \
   --cert=./tls.crt \
   --key=./tls.key
