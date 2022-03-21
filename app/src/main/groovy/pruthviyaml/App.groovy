package pruthviyaml

import groovy.yaml.YamlSlurper

class App {

    static void main(String[] args) {
        def slurper = new YamlSlurper().parse(App.getResourceAsStream('/example.yaml'))
        String animal = slurper.Animal
        String bird = slurper.Bird
        println "Animal: $animal"
        println "Bird: $bird"
    }
}
