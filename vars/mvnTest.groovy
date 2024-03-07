def call(){
    sh 'java --version'
    sh 'mvn --version'
    sh 'mvn test'
}
