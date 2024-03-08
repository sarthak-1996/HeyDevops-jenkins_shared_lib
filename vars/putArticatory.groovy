def call(String jfrogip){
  // withCredentials([usernamePassword(
  //           credentialsId: "jfrog",
  //           usernameVariable: "USER",
  //           passwordVariable: "PASS"
  //   )])
  sh 'curl -X PUT -u admin:Kolkata@01 -T /var/lib/jenkins/workspace/HeyDevops-Java_app_3.0/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${jfrogip}:8082/artifactory/example-repo-local/'
}
