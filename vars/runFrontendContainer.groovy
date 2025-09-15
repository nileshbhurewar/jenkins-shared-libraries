def call() {
    sh '''
        docker rm -f easycrud-frontend || true
        docker run -d --name easycrud-frontend -p 80:80 nileshbhurewar/easycrud-jenkins:frontend
    '''
}
