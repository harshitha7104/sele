pipeline {
    agent any

    tools {
        jdk 'JDK'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Run Selenium App') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

}
