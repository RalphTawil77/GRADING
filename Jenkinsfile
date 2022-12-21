/* Requires the Docker Pipeline plugin */
pipeline {
    agent any
    tools{
    maven 'maven'
    jdk 'Jenkin-Java'
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
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