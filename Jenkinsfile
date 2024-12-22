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
    post {
        always {
            echo 'This will always run'
            junit 'target/surefire-reports/*.xml'
            // deleteDir()
        }
        success {
            echo 'This will run only if successful'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            sh 'cp target/winter_spring-0.0.1-SNAPSHOT.jar /home/agencik/apka/apka.jar'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
        }
    }
}
