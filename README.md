adding read me file 

HelmChart commands 

# HelmChat name 
helm create spring-boot-customer-helm-chat

# See the structure the created helmchart
tree spring-boot-customer-helm-chat

# helm chat referent name and helmchart name
helm install spring-boot-customer-helm-chat spring-boot-customer-helm-chat

# To open the created service access from external world , with service name in the cluster
minikube service spring-boot-customer-helm-chat -p local-cluster

