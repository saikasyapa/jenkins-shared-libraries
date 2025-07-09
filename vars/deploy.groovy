def call(String Project, String ImageTag){
  echo "Deploy the docker image"
  sh "docker run -d -p 8000:8000 ${Project}:${ImageTag}"
  echo "notes-app is running."
}
