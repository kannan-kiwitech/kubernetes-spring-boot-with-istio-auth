# Setup Instructions

Go to kubernetes shell and run the following commands

```
git clone https://github.com/kannan-kiwitech/kubernetes-spring-boot-with-istio-auth.git
cd kubernetes-spring-boot-with-istio-auth/kube
kubectl apply -f deployment-record.yaml
kubectl apply -f deployment-user.yaml
kubectl apply -f gateway.yaml
```

Check the swagger and consume the APIs, now all the APIs will be public
```
eg: http://34.69.1.222/records/swagger-ui.html#/medicines-controller/searchMedicinesUsingGET
```
Execute the following command to apply the authentication policy

```
kubectl apply -f auth-policy.yaml
```
Now you'll only be able to execute the swagger documentations with out token, all the APIs you would require a JWT

Credentials are hard-coded for brevity

Authorization WIP ... 



