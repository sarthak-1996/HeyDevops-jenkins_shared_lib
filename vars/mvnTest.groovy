def call(){
    sh 'java --version'
    sh 'hostname -i'
    sh 'pwd'
    sh 'mvn --version'
    sh 'mvn test'
}
