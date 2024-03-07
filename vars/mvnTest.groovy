def call(){
    sh 'sudo apt install maven -y'
    sh 'mvn test'
}
