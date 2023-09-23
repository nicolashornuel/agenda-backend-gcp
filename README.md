# agenda-backend-gcp



migrate firestore data with bucket of google cloud storage
pb = database source : nam5 and database target : eur3
solution = install local agent 

gcloud auth application-default login
gcloud projects list
gcloud config set project $GCP_APP_NAME
gcloud transfer agents install --pool=filesystem --id-prefix=macosx --mount-directories=/Users/macbookpro/Documents

gcloud transfer agents install --pool=cloudrun-java --id-prefix=macosx --mount-directories=/Users/macbookpro/Documents
