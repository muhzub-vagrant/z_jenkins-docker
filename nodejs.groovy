job('Z_NodeJs Example')
{
//fetch code from z_docker-demo.git and give configuration name and email    
    scm {
        git('https://github.com/muhzub-vagrant/z_docker-demo.git') 
//        { node -> 
//        node / gitConfigName('muhzubvagrant')
//        node / gitConfigEmail('muhzub-vagrant@gmail.com')
//        }
    }

//trigger build after every 5 min
    triggers {
        scm('H/5 * * * *')
    }
//NodeJs installation
    wrappers {
        nodejs('nodejs')
    }

    steps {
        shell("npm install")
    }





}
