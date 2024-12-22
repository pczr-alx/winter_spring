pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                sh 'chmod u+x ./mvnw'
                sh './mvnw clean package'
            }
        }
    }
}
