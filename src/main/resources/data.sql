INSERT INTO Product (id, name, type, description)
VALUES (1, 'Gateway', 'oss', 'Kong or Kong API Gateway is a cloud-native, platform-agnostic, scalable API Gateway distinguished for its high performance and extensibility via plugins.'),
       (2, 'Insomnia', 'oss', 'Insomnia is an open-source, cross-platform API Client for GraphQL, REST, and gRPC.'),
       (3, 'Developer Portal', 'enterprise',
        'The Kong Developer Portal provides a single source of truth for all developers to locate, access, and consume services. With intuitive content management for documentation, streamlined developer onboarding, and role-based access control (RBAC), Kong’s Developer Portal provides a comprehensive solution for creating and customizing a unified developer experience.'),
       (4, 'Kong Mesh', 'enterprise',
        'Enterprise service mesh based on Kuma for multi-cloud and multi-cluster on both Kubernetes and VMs. Built on top of Envoy, Kong Mesh is a modern control plane focused on simplicity, security and scalability.'),
       (5, 'Kuma', 'oss',
        'The universal Envoy service mesh for distributed service connectivity. The open-source control plane for service mesh, delivering security, observability, routing and more');
-- END TABLE Product

-- BEGIN TABLE Session
-- Inserting 33 rows into `Session`
-- Insert batch #1
INSERT INTO Session (id, title, description, date, presenters)
VALUES (1, 'Opening Keynote: Meta-modern Software Architecture',
        'Where do architecture styles come from? Do architects retreat to an ivory tower to decide what the Next Big Thing will be? No–new capabilities constantly appear in the software development ecosystem, and clever architects figure out new ways to leverage the new building blocks, leading to new named architecture styles which are only named after they have existed for a while. This is similar to art and cultural movements, how Victorianism became Modernism. In this keynote, Neal traces the similarities between architecture styles and cultural movements, how each affect the other, and points towards how Metamodernism will inform architecture, corporations, and individual workers in a fundamental way.',
        '2022-04-13 10:00:00.000', '[
    "Neal Ford "
  ]'),
       (2, 'What''s in Kubernetes that developers should care about (and why)',
        'Learn the tools, best practices, and approaches to take the best results from Kubernetes (as a developer), without feeling overwhelmed about it.', '2022-04-13 10:00:00.000',
        '[
          "Elder Moraes "
        ]'),
       (3, 'Forward with Java 18 and Beyond!',
        'The most recent LTS Java 17 was released in September, so the question is obviously, what\’s next for Java? In this presentation we will look at some of the new features introduced between Java 11 and Java 17 that are laying the foundation for some exciting new changes coming in Java in 18 and beyond!',
        '2022-04-13 10:00:00.000', '[
         "Billy Korando "
       ]'),
       (4, 'Refactoring Code: An Incremental and Purpose Driven Approach',
        'Continuous refactoring is critical to succeeding in projects and is an important part of sustainable agile development. In this workshop, we will start by discussing how to approach refactoring, the essential steps we need to take, and look into how to incrementally improve the internal design of code to make it extensible, maintainable, and cost-effective to change. In addition to discussing the concepts, we will take several code examples from real projects, discuss the code smells and explore the refactoring techniques. Along the way, we will also dive into refactoring short code samples and measure the quality of code before and after refactoring.',
        '2022-04-13 10:00:00.000', '[
         "Venkat Subramaniam "
       ]'),
       (5, 'Apache Kafka simply explained', 'Learn Apache Kafka in uncomplicated and entertaining terms and get equipped with practical knowledge for your first steps in the Apache Kafka world.',
        '2022-04-13 10:00:00.000', '[
         "Olena Kutsenko "
       ]'),
       (6, 'Why having your own Mr. Miyagi shouldn\’t be luck but a given.',
        'Mr. Who? Besides one of my childhood heroes, Mr. Miyagi is a fictional karate master from Okinawa, Japan, in the movie series “The Karate Kid”. He was the karate mentor of several people and made them worthy champions. I wanted to be each of those people and then my own karate journey started with my own “sensei” (mentor). Then I became a lawyer and got a so-called “patroon” (another mentor). When I took my first steps in my career switch to the IT world, I discovered that mentorship is not a matter of course. What a pity! Fortunately, I managed to find one again. I have experienced the difference of not having and having one, as a difference between day and night.',
        '2022-04-13 10:00:00.000', '[
         "Kelly Jille "
       ]'),
       (7, 'Double-plus Ungood: Why Log4Shell Is So Bad', 'Log4Shell shook the Java community. What made it so bad and what do we do about it?', '2022-04-13 10:00:00.000', '[
         "Josh Cummings "
       ]'),
       (8, 'Alpine.js : Declare and React with Simplitcy',
        'In this session we will introduce the power of Alpine.js as a modern, lightweight, declarative and reactive Javascript framework that can be embedded on any webpage without any need of webpack or complicated build processes.',
        '2022-04-13 10:00:00.000', '[
         "Luis Majano "
       ]'),
       (9, 'CI/CD Pipelines : What, Why, How?',
        'To avoid getting caught up in notions of “the right tool” it is important to understand the core concepts of continuous integration (CI) and continuous delivery or continuous deployment (CD). Choosing the right tool should be a consequence of defining the right goals, metrics and processes to automate. In this session we will explore common ideas that must be present in commercial and open source solutions to monitor, automate, verify and deliver software. For example: Tasks, Steps, Runs, End-to-end automation, Workflows, Tool orchestration, Release cycles, among others.',
        '2022-04-13 10:00:00.000', '[
         "Ixchel Ruiz "
       ]'),
       (10, 'A Tour of the Modern Java Platform',
        'The Java Platform has seen a tremendous amount of evolution and improvements over the past 5 years in many different areas including: language features in Java, Kotlin, and Scala, Functional Programming, dev environments, test workflows, Reactive, Stream processing, distributed data, containerization, Serverless, and AoT compilation. This talk will give you a tour of the most important improvements, why they matter, and how to take advantage of them.',
        '2022-04-13 10:00:00.000', '[
         "James Ward "
       ]'),
       (11, 'Java on Kubernetes: What I wish I knew first',
        'The Kubernetes ecosystem can be very operator-focussed, and it can be a challenge for developers to distil the information that is relevant for their job.', '2022-04-13 10:00:00.000',
        '[
          "Abel Salgado",
          "Alberto C. Ríos "
        ]'),
       (12, 'Zero Trust Architecture',
        'Do you know your users, devices, services, data, architecture? Do you have policies to enable accesses? Do you always authorize and authenticate or implicitly trust anyone when accessing your services? Come let us talk about building a resilient and secure organization with Zero trust.',
        '2022-04-13 10:00:00.000', '[
         "Sendil Kumar "
       ]'),
       (13, 'Batch Processing in Action',
        'In the enterprise world, we need to deal with a large amount of data that comes from multiple sources, and there\’s a considerable amount of effort to read, process, and distribute it. As the number of records increases, plain Java may not be the best solution. With many out-of-the-box solutions such as transaction management, retry, chunk processing, and several templates, Spring Batch is a lightweight framework to help you in these tasks. This talk will dig into Spring Batch, discuss its architecture and templates, and live code examples to demonstrate its power.',
        '2022-04-13 10:00:00.000', '[
         "Hillmer Chona",
         "Rodrigo Graciano "
       ]'),
       (14, 'Liberation for your data!',
        'Join us in this session to see a live demo using Apache Kafka showing how to set up a change data stream out of your application\’s database without any code changes and consume change events in other services, update search indexes, and much more.',
        '2022-04-13 10:00:00.000', '[
         "Hugo Guerrero "
       ]'),
       (15, 'What is Adoptium?',
        'AdoptOpenJDK has moved to the Eclipse Foundation. In this session, I will explain what the move means, the progress we\’ve made and the exciting new opportunities! Come along and learn what Eclipse Temurin is, what the migration path looks like and how to get involved in the project!',
        '2022-04-13 10:00:00.000', '[
         "George Adams "
       ]'),
       (16, 'Writing Code for the Future',
        'Are you still referring to your primary instances as “master?” In our evolving culture, there are myriad words and phrases to be avoided in our code, towards the goal of software being an equitable, welcoming space. Join me to learn what\’s problematic to include in your code, why these things ought to be avoided, and what to write instead.',
        '2022-04-13 10:00:00.000', '[
         "Valarie Regas "
       ]'),
       (17, 'Exploring Stateful Microservices in the Cloud Native World',
        'While stateless systems are easier to architect, design, and implement, the truth of the matter is that we live in a stateful world in which we need to keep track of the state of data in a lot of cases. So how can we handle persisting data with containerized microservices in a Cloud Native world?',
        '2022-04-13 10:00:00.000', '[
         "Grace Jansen "
       ]'),
       (18, 'Measuring the Impact of Software Craft',
        'At the business level it\’s hard to effectively measure the quality of software. We start quality initiatives and they don\’t always work and we\’re hard press to understand why. Our code coverage went up, our time to market decreased yet we\’re still finding issues that slow us down. Time To Market is just one aspect of measuring speed. In this talk tie in delivery techniques to metrics and how business can use these metrics to shape their software craft transformations.',
        '2022-04-13 10:00:00.000', '[
         "Ben Scott "
       ]'),
       (19, 'Stranger Danger: Your Java Attack Surface Just Got Bigger',
        'Building cloud-native Java applications is undoubtedly awesome. However, it comes with undeniable new risks. Next to your own code, you are relying on so many other things. Blindly depending on open-source libraries and Docker images can form a massive risk for your application. The wrong package can introduce severe vulnerabilities into your application, exposing your application and your user\’s data. Join this hands-on Java cloud-native live-hacking session where we\’ll show common threats, vulnerabilities, and misconfigurations. Most importantly, you\’ll learn how to protect your application with actionable remediation and best practices',
        '2022-04-13 10:00:00.000', '[
         "Brian Vermeer "
       ]'),
       (20, 'On the Edge of My Server',
        'Edge functions can be potentially game changing. You get the power of serverless functions but running at the CDN level - meaning the response is incredibly fast. All the providers are piling into the space – AWS, Cloudflare, Netlify and Vercel to name just a few – but all the offerings are quite different. In this talk, we\’ll explore why edge functions can be powerful, the different offerings available, and examples of how you can use them on different providers.',
        '2022-04-13 10:00:00.000', '[
         "Brian Rinaldi "
       ]'),
       (21, 'Making Maven Marvelous',
        'Have you ever used Maven, ran into a bug and thought: “How on earth can a project this old have this bug?”. Then join this session! Maven, although a well-known and well-trusted project, is run by a relatively small bunch of people. There\’s simply more work to do than these people can do! So instead of getting angry, or looking for alternatives, you can contribute to Maven yourself and work on making it even better. Join us on our journey from “how on earth” to “works like heaven”. We\’ll discuss how we did it, what we did, and most importantly: how you can start contributing to Maven as well! As you walk out the room, better reserve some time in your calendar to start working on that bug.',
        '2022-04-13 10:00:00.000', '[
         "Giovanni van der Schelde "
       ]'),
       (22, 'What''s "Loom"ing in Java: The Why and What of Project Loom',
        'Multithreading has been in Java from day one. The multithreading API has gone through significant changes over the years. And yet, we have something major that\’s threading again. What\’s the reason for yet another implementation, yet another change? How is that different from what we already have. When will we use the new model and when will we stick to the existing APIs. Too many questions but we will not take them all in parallel. Instead we will give the questions serious thoughts and get a deeper understanding of the purpose of Project Loom, what problems it solves, and how and when we can benefit from it.',
        '2022-04-13 10:00:00.000', '[
         "Venkat Subramaniam "
       ]'),
       (23, 'Container Usage Patterns',
        'Embraced containers yet? If so, that only presents the beginning of the journey. Designing your images to be lean, and your containers configurable requires us to leverage Dockerfiles to their maximum potential. At scale, everything matters—build times, testing, multi-stage builds, conventions around tagging and logging. There is a whole ecosystem of tools around how we can best build our images and containers. In this session we will learn many a trick on how we can leverage Docker\’s own tooling as well as third-party tools to ensure that our first steps in the container world are the right ones.',
        '2022-04-13 10:00:00.000', '[
         "Raju Gandhi "
       ]'),
       (24, 'How does a matching engine work?',
        'Electronic exchanges have allowed global markets to become digital. At the heart of an exchange sits a “matching engine” application. Being ultimately responsible for connecting buyers and sellers, a matching engine poses difficult technical challenges around latency, high availability, fairness, determinism, auditability, stability, etc. In this presentation we will discuss the journey we traveled to build new matching engines at the Intercontinental Exchange, and how we addressed each of those concerns.',
        '2022-04-13 10:00:00.000', '[
         "Juan D Bustamante "
       ]'),
       (25, 'What\’s New in Spring in 2022',
        'Spring Framework 5, Spring Boot 2, and Spring Cloud have had stable versions since 2017-2018. This year each active Spring project will have a new major release. We will talk about the practical implications of changes to the Java baseline, Jakarta EE, native compilation, observability and more. We will discuss the support options for remaining on the existing generation. We will show what upgrading an existing application looks like using the latest milestones.',
        '2022-04-13 10:00:00.000', '[
         "Spencer Gibb "
       ]'),
       (26, 'Quarkus. A Bliss for developers',
        'Everyone is excited about Quarkus, the Kubernetes Native Java stack that lets you create Java applications with a small memory footprint and amazingly fast boot time (just some milliseconds) offering near-instant scale-up and high-density memory utilization in container orchestration platforms like Kubernetes and a perfect match for serverless. But these capabilities are useful at runtime, but what does Quarkus offer to developers to use at development time?',
        '2022-04-13 10:00:00.000', '[
         "Alex Soto "
       ]'),
       (27, 'Supercharge your Ingress with Kong',
        'During this talk, you will learn how to declaratively enable security, API rate limiting, how to add native gRPC support using Kong Gateway and plugins.', '2022-04-13 10:00:00.000',
        '[
          "Viktor Gamov "
        ]'),
       (28, 'Removing complexity from integration tests using Testcontainers!',
        'Integration tests are essential for testing both microservices and enterprise applications. Learn the best practices of using Testcontainers to make integration tests fast, flexible, stable, & repeatable.',
        '2022-04-13 10:00:00.000', '[
         "Oleg Šelajev "
       ]'),
       (29, 'The Future is Kube-Native',
        'We\’ve heard about Cloud and Cloud-Native in the past years, but don\’t be mistaken: the future is Kube-Native. Kubernetes is an open-source platform that runs everywhere, and ensuring that applications are Kube-Native allows you to reuse your super skills no matter where you deploy. Join us in this session to learn how a common set of best practices regarding patterns and tools can help you solve today\’s challenging problems in monolithic and microservices architectures. ',
        '2022-04-14 10:00:00.000', '[
         "Edson Yanaga "
       ]'),
       (30, 'Getting Caught up with Kotlin',
        'Kotlin is one of the industry\’s newest darlings. It\’s sleek. It\’s succinct. It\’s seemingly everywhere these days. It gets crazy amounts of hype but is it worth it? I say yes, of course, but it\’s actually easy to find out for yourself! This talk will go over the basics of the syntax and show scads of examples of how Kotlin can make your life easier. And it\’s not just for mobile development! We\’ll look, briefly, at a number of preexisting libraries that have nothing to do with mobile dev that you can use today in whatever project you have in mind. Curious about Kotlin? Come join the journey and find out more!',
        '2022-04-14 10:00:00.000', '[
         "Justin Lee "
       ]'),
       (31, 'Bootiful Edge Services',
        'Hi, Spring fans! So much of the difficulty of microservices is not the services themselves, but the clients that connect to them. There are just so many things that can go wrong or cause bumps on the road to production! Clients may not speak the same protocols as the services to which they\’re connecting. Clients may need to adapt the data coming from services to suit their use cases, tailoring them to the user interface\’s particular requirements. Join me, Spring Developer Advocate Josh Long (@starbuxman) and we\’ll look at how to use reactive programming to build better API adapters, how to use Spring GraphQL to build better data integration gateways, and we\’ll look at Spring Cloud Gateway to build API gateways.',
        '2022-04-14 10:00:00.000', '[
         "Josh Long "
       ]'),
       (32, 'Typescript for the busy Java developer',
        'Even if you haven\’t used Javascript, you have probably heard scary stories about an inconsistent language, with no type system, that is used by almost every single modern web application that runs in your browser. What if I tell you that it is also used for backend services! Oh, the horror! As a Java backend developer, that idea gives me the chills. Typescript to the rescue! Typescript is a modern language developed by Microsoft that\’s built on top of Javascript, adding additional syntax, tooling and most importantly, a type system! This talk provides an introduction to the language, we\’ll explore some similarities and differences with Java through code examples!',
        '2022-04-14 10:00:00.000', '[
         "Orlando Valdez "
       ]'),
       (33, 'DevOps for Java Shops',
        'DevOps is great, if you have the people, processes and tools to support it. In this session I\’ll highlight the easiest ways for Java developers to work with their IT organizations and partners to deliver their code to the cloud, including the best ways to reliably make updates and maintain production cloud code. The focus is on real-world examples using Linux command line tools, open source tools including Jenkins, and other free SDKs and tools available on GitHub.',
        '2022-04-14 10:00:00.000', '[
         "Brian Benz "
       ]');

-- END TABLE Session



