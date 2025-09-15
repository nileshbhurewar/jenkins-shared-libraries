def call() {
    sh "docker build -t nileshbhurewar/easycrud-jenkins:frontend /var/lib/jenkins/workspace/easy-crud/frontend"
}