kubectl create secret tls kong-cluster-cert -n kong \
   --cert=tls.crt \
   --key=tls.key
