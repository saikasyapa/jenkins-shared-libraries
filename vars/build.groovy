def call(String ProjectName) {
  echo "This stage is for building the image."
  sh "docker build -t ${ProjectName} ."
  echo "Image builded successfully."
}
