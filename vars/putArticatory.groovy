def call(String jfrogip){
  withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )])
  sh 'curl -X PUT -u '$USER':'$PASS' -T /target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${jfrogip}:8082/artifactory/example-repo-local/'
}
