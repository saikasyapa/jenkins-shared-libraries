def call(String url, String branch){
  echo "This is clonning the code"
  git url: "${url}", branch: "${branch}"
  echo "Code clonning successfully"
}
