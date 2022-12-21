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
                bat 'echo running build automation...'
                bat 'mvn clean install'
            }
}
        stage('Unit Tests') {
        agent {docker { image 'maven:3.3.3'}}
            steps {
                bat 'echo Unit Tests...'
                bat 'mvn verify -DskipITs=true'
            }
        }
        stage('Integration Tests') {
        agent {docker { image 'maven:3.3.3'}}
            steps {
                bat 'echo Integration Test...'
                bat 'mvn verify -DskipUTs=true'
            }
        }
        stage("Build Docker Image"){
        agent any
        steps{
        script{
        bat 'echo Building docker image...'
        app = docker.build("ralphtawil/fyp-grading")
        }}
        }
        stage("Push Docker Image"){
        agent any
        steps{
        script{
        bat 'echo Pushing docker image...'
        docker.withRegistry('http://registry.hub.docker.com','dhcredentials')
        app.push("${env.BUILD_NUMBER}")
        app.push("latest")}
        }}
        }

//         post{
//             always{
//                 mail to: "ralph.tawil@net.usj.edu.lb",
//                      subject: "jenkins build:${currentBuild.currentResult}: ${env.JOB_NAME}",
//                      body: "${currentBuild.currentResult}: Job ${env.JOB_NAME}\nMore Info can be found here: ${env.BUILD_URL}"
//             }
//         }
}}
