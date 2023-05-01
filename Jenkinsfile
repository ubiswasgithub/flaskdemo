pipeline {
    agent any
    stages {
    
    stage('Build') {
            steps {
                sh 'Build is started.................'
                sh 'Build is Finished.................'
            }
        }
        stage('Test') {
            steps {
            
            	sh 'Test is started.................'
                sh 'mvn test'
            }
        }
        
        
        stage('Deploy') {
            steps {
            
            	sh 'Deploy is started.................'
                sh 'Deploy is finished'
            }
        }
    }
}