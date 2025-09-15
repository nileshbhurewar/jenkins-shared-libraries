def call() {
    sh "docker build -t nileshbhurewar/easycrud-jenkins:backend /var/lib/jenkins/workspace/easy-crud/backend"
}
