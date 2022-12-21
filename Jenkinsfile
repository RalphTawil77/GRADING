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
        stage ('Build') {
            steps {
<<<<<<< HEAD
                bat 'mvn -Dmaven.test.failure.ignore=true install'
=======
                sh 'mvn -Dmaven.test.failure.ignore=true install'
>>>>>>> 84081ae9da3c6503ea026948aa12a10f72554c13
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
