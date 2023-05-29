pipeline {
        agent any

        stages {
                stage('main pull coding'){
                        steps {

                                echo 'pull coding is finished!!!'
                        }
                }

                stage('execute build'){
                        steps {

                                echo 'execute build is done!!!'
                        }
                }

        }

        post {
                always {
                        echo 'succeeded!!!'
                }

                failure {
                        echo 'failed!!!'
                }
        }

}
