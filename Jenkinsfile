pipeline {
    agent any
    tools{
        maven 'maven 3.6'
    }

    
                        
        
       stage('Test') {
            steps {
                bat "mvn clean test"
            }
        }
    
    
        stages {
    
        stage('sonar code quality check'){
            steps{
                script{
                    withSonarQubeEnv('sonar server'){
                        bat "mvn sonar:sonar"
                        }
                    timeout(time:1 , unit: 'HOURS'){
                        def qg=waitForQualityGate()
                        if(qg.status!='OK'){
                            error "pipeline aborted due to quality gate failure: ${qg.status} "
                            
                        }
                     }
                        
                 }
               }
         }
        
        
        
        stage('Build') {
            steps {
               bat "mvn clean package"
            }
        }
        
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'deb6a03a-af91-4005-a063-4680c5b1a904', path: '', url: 'http://localhost:8081/')], contextPath: 'calculator', war: '**/*.war'
            }
        }
    }
}
