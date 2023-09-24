# agenda-backend-gcp

[![Deploy java App to Cloud Run](https://github.com/nicolashornuel/agenda-backend-gcp/actions/workflows/GCP-Deploy.yml/badge.svg?branch=master)](https://github.com/nicolashornuel/agenda-backend-gcp/actions/workflows/GCP-Deploy.yml)

CI-CD

gcloud auth application-default login  
gcloud projects list  
gcloud config set project $GCP_APP_NAME  


https://console.cloud.google.com/run/detail/europe-west9/agenda-backend/logs?project=cloudrun-java  
https://console.cloud.google.com/iam-admin/iam?project=cloudrun-java  
Rôles :   
	- Compte de service Cloud Build  
	- Développeur Cloud Run  
	- Utilisateur du compte de service  
