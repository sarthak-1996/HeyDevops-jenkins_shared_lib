def call(){
    sh 'apt install maven -y'
    sh 'mvn test'
}
