def call() {
    sh '''
        docker rm -f easycrud-backend || true
        docker run -d --name easycrud-backend -p 8081:8081 nileshbhurewar/easycrud-jenkins:backend
    '''
}
