# Augmented-Backend

Spring boot API back end for Augmented Application.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The following should be installed on a machine in order to easily develop and contribute. It may be easiest to install [Oracle VM Virtual Box](https://www.virtualbox.org/) on a Windows machine, and run everything through a [Linux Ubuntu](https://www.ubuntu.com/) VM. The following software should be installed and configured on your machine; Java, Maven, and Eclipse. Eclipse should also have the Spring Tools installed through the add-on market place. If you'd like to test deploy the application, Heroku should also be installed on your machine.

### Installing

After clone the repository locally, Import the project into Eclipse as an Existing Maven project. Be sure that you are not working on the master branch locally.

## Versioning

This project essentially uses [SemVer](http://semver.org/) for versioning, with the PATCH number always assumed to be zero unless noted otherwise. For the versions available, see the [tags on this repository](https://github.com/cameronDz/augmented-backend/tags). Releases will only be published for MAJOR versions.

No code development should be done on the "master" branch. Instead, the "develop" branch should be used to branch off of for various features/issues. Features, fixes, and issues should all be in the GitHub [Issues section for the repository](https://github.com/cameronDz/augmented-backend/issues) before development work begins. Once a feature/fix/issue is done, all commits need to be squashed into a single commit. A Pull Request should then be made for that commit into the "master" branch. The pull request should contain [keywords to close the Issue](https://help.github.com/articles/closing-issues-using-keywords) that was being corrected. If the commit is deployed, it should be tagged as the latest version in git, as well as updated in the pom.xml and application.properties files.

The [Project section of the repository](https://github.com/cameronDz/augmented-backend/projects) tracks the work planned for each major Release. Releases should consist of between 10 - 20 tags. Hot fixes should still follow the protocol for being done in "develop" and squashed into "master".

## Built With

* [Java](https://www.java.com/en/)
* [Spring Boot](http://spring.io/projects/spring-boot) - API Framework
* [Maven](https://maven.apache.org/) - Dependency Management 
* [Heroku](https://heroku.com) - Deployed/Cloud Hosting
* [AWS RDS](https://aws.amazon.com/rds/) - Deployed Database
* [Mockito](https://site.mockito.org/) - Java Testing Framework
* [Eclipse](https://www.eclipse.org/) - IDE

## Deployment

To deploy to Heroku, install heroku on command line, set the git heroku upstream, and run 

```
git push heroku master
```

## Authors

* **Cameron Dziurgot** - *Initial work* - [cameronDz](https://github.com/cameronDz)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on code of conduct, and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details

## Acknowledgments

* This README and CONTRIBUTING file was created from a template created by [PurpleBooth](https://github.com/PurpleBooth)
