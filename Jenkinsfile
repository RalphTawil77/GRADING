/* Requires the Docker Pipeline plugin */
pipeline {
    agent none
    tools{
    maven 'maven'
    jdk 'Jenkin-Java'
    }
    stages {
        stage ('Initialize') {
        agent any
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Build') {
        agent {docker { image 'maven:3.2.1'}}
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
