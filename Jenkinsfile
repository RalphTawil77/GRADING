/* Requires the Docker Pipeline plugin */
pipeline {
    agent none
    tools{
    maven 'maven'
    jdk 'Jenkin-Java'
    }
    stages {
        stage ('Build') {
        agent {docker { image 'maven:3.3.3'}}
            steps {
                bat 'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }}
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
