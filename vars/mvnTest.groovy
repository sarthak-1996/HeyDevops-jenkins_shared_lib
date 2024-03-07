def call(){
    sh 'mvn --version'
    sh 'mvn test'
}
