def call(String GitUrl, String GitBranch){
  echo "This is clonning the code"
  git url: "${GitUrl}", branch: "{GitBranch}"
  echo "Code clonning successfully"
}
