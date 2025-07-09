def call(String Project, String ImageTag) {
  echo "This stage is pushing code o dockerhub."
  withCredentials([usernamePassword('credentialsId':'DockerHub_Auth',passwordVariable:'dockerHubPass',usernameVariable:'dockerHubUser')]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
  sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}
