/* Requires the Docker Pipeline plugin */
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'echo test'
            }
        }
        stage('Test') {
            steps {
                bat 'echo Testing...'
            }
        }
        stage('Deploy') {
            steps {
                bat 'echo Deploying...'
            }
        }

    }
}