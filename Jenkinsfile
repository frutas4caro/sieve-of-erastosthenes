pipeline{
	agent { dockerfile true }
	stages {		 
stage('Build image') {         
       
            app = docker.build("brandonjones085/test")    
       }     
      stage('Test image') {           
            app.inside {            
             
             sh 'echo "Tests passed"'        
            }    
        }     
}

}

