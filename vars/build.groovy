def call(String ProjectName) {
  echo "This stage is for building the image."
  sh "docker build -t ${project} ."
  echo "Image builded successfully."
}
