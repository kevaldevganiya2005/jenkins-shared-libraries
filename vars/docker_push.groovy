def call(String Project, String ImageTag, String dockerHubUser){
   withCredentials([usernamePassword(
                credentialsId: 'dockerHub-cred',
                usernameVariable: 'dockerHubUser',
                passwordVariable: 'dockerHubPass'
            )]) {
            sh 'echo "$dockerHubPass" | docker login -u "$dockerHubUser" --password-stdin'
   }
            sh "docker push kevaldevganiya2005/notes-app:latest"
        
}
