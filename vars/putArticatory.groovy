def call(){
  sh """
  cd ./target/
  curl -X PUT -u admin -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://23.20.203.179:8082/artifactory/example-repo-local/
  """
}
