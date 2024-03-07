def call(){
    sh 'java --version'
    sh 'hostname'
    sh 'pwd'
    sh 'mvn --version'
    sh 'mvn test'
}
