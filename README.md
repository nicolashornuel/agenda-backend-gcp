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

## pb :  
 https://cloud.google.com/iam/docs/service-accounts-actas?hl=fr
ERROR: (gcloud.run.deploy) PERMISSION_DENIED: Permission 'iam.serviceaccounts.actAs' denied on service account 803550064099-compute@developer.gserviceaccount.com (or it may not exist).
