## [2.2.0](https://github.com/FreshMag/testo/compare/2.1.0...2.2.0) (2025-01-09)

### Features

* forced npm publish ([0061736](https://github.com/FreshMag/testo/commit/00617364e53c9fff4a36dd797dc6d25b38b389e2))
* removed JsExport, added debug class ([b310131](https://github.com/FreshMag/testo/commit/b3101313d2f9645542eb2f06f548453869b266db))

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#25](https://github.com/FreshMag/testo/issues/25)) ([1dfefed](https://github.com/FreshMag/testo/commit/1dfefed23b7099867850fdf457a8292bea61d7a6))

### Tests

* added more tests for yaml ([796d4d2](https://github.com/FreshMag/testo/commit/796d4d241d05fbad39c68815345f7cc1da2665de))
* added one more test for YAML ([6aee541](https://github.com/FreshMag/testo/commit/6aee541c2f0e0e3a20398ad36cb3eaeef2ffa490))
* added skeleton test ([7ef36e3](https://github.com/FreshMag/testo/commit/7ef36e3237fc0ca67f802cffcc6f09e9b11fc38c))

### Build and continuous integration

* added yamlkt serialization library ([0f14bf9](https://github.com/FreshMag/testo/commit/0f14bf9d4fc65d8b7463900ff97e13ba5d7f3994))

## [2.1.0](https://github.com/FreshMag/testo/compare/2.0.4...2.1.0) (2025-01-08)

### Features

* added example grammar ([a2ed814](https://github.com/FreshMag/testo/commit/a2ed814f0328acae1fe48d073327b44af3b43533))

### Tests

* added simple tests to check antlr usage ([6e0c992](https://github.com/FreshMag/testo/commit/6e0c9927e754fadc52d29cdffae292571106b67b))

### Build and continuous integration

* added antlr-kotlin to build.gradle.kts ([73c9b32](https://github.com/FreshMag/testo/commit/73c9b325caaee86b45b1a4709efcf065a5adb03b))
* added git hook for detekt and ktlint tasks ([7c23b46](https://github.com/FreshMag/testo/commit/7c23b4679ad001170ca191ddc726e1d676f4bbdb))
* downgraded gradle wrapper version to 8.8 to avoid build errors with antlr-kotlin ([6df396b](https://github.com/FreshMag/testo/commit/6df396be46ecdfb2984bd7f432e0b3675a0ee29a))
* extracted antlr-runtime library to libs.versions.toml ([71db616](https://github.com/FreshMag/testo/commit/71db616cab33dfc9e390e3e18ab12b0cdf6f9d91))
* updated checksum of gradle wrapper distribution ([6d20c62](https://github.com/FreshMag/testo/commit/6d20c62372bd5dbe46e6688717978f9e1c9efbba))

## [2.0.4](https://github.com/FreshMag/testo/compare/2.0.3...2.0.4) (2025-01-08)

### Bug Fixes

* fixed js module name avoid already taken 'testo' ([b272c76](https://github.com/FreshMag/testo/commit/b272c7621c8a16afe8de2e3e2637153a5a92809b))

## [2.0.3](https://github.com/FreshMag/testo/compare/2.0.2...2.0.3) (2025-01-08)

### Bug Fixes

* fixed js module name avoid already taken 'testo' ([c01c081](https://github.com/FreshMag/testo/commit/c01c081e9bd58c2aa26c5c4c76f818edc09fae41))

## [2.0.2](https://github.com/FreshMag/testo/compare/2.0.1...2.0.2) (2025-01-08)

### Bug Fixes

* fixed forcingVersion in the ci ([9d894d6](https://github.com/FreshMag/testo/commit/9d894d6af6b7671a28ff1cd5e57623655e6457e2))

## [2.0.1](https://github.com/FreshMag/testo/compare/2.0.0...2.0.1) (2025-01-08)

### Bug Fixes

* enabled npm publishing and shortened CI structure ([81898c3](https://github.com/FreshMag/testo/commit/81898c3d0d93e2db18190442c1bbe2c8b12d57b0))

### Style improvements

* added style violation (on purpose) ([420f801](https://github.com/FreshMag/testo/commit/420f801f85ccd80be00ba5cae0c4fb446ab90452))
* removed style violation ([e7e7068](https://github.com/FreshMag/testo/commit/e7e7068b658d6a053a18978c59e8ec9afa0a5446))

## [2.0.0](https://github.com/FreshMag/testo/compare/1.14.3...2.0.0) (2025-01-07)

### ⚠ BREAKING CHANGES

* this is a test major release

### Features

* re-enabled test in the CI ([a780bec](https://github.com/FreshMag/testo/commit/a780bec1b201cf4c6e7b0014ece5c2ab99eb4bf7))
* re-enabled test in the CI ([f4f2c73](https://github.com/FreshMag/testo/commit/f4f2c73a69fb0cbb6f2eb386eef8967d12676b21))
* updated test-extensively.yml with matrix os ([f5490d1](https://github.com/FreshMag/testo/commit/f5490d154deba8b0288bcda00d60da80e64f1cf3))

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#3](https://github.com/FreshMag/testo/issues/3)) ([183e3c1](https://github.com/FreshMag/testo/commit/183e3c1206d90fdc248bffd29181b311df6f12f2))
* **deps:** update node.js to v22.13.0 ([3309f06](https://github.com/FreshMag/testo/commit/3309f060e632bdec782a11354d5509fea3cc1cf8))
* **deps:** update plugin kotlin-qa to v0.78.0 ([9534428](https://github.com/FreshMag/testo/commit/953442840d031d9476f6900c8ea2b1810c65e7b1))
* **deps:** update plugin multijvmtesting to v3 ([2536bbb](https://github.com/FreshMag/testo/commit/2536bbbb93e2418d3400fb6b2483324384f22269))
* **deps:** update plugin publishoncentral to v7 ([a9427d4](https://github.com/FreshMag/testo/commit/a9427d4e573f50fb180e999da3f7c95cad350bf2))

### Bug Fixes

* **deps:** update kotlin monorepo to v2.1.0 ([afb1b29](https://github.com/FreshMag/testo/commit/afb1b291af137386d2384903a8c74d74954ce241))
* empty commit ([9160b70](https://github.com/FreshMag/testo/commit/9160b70b2db421d8fc15f40936cf4044999eaceb))
* removed failing test ([a43b3d9](https://github.com/FreshMag/testo/commit/a43b3d96954a685d155bad975235e5c860bfeeda))
* removed failing test ([1796c40](https://github.com/FreshMag/testo/commit/1796c402233e8f23d7f7b5a4aeb471e6340be123))

### Tests

* added failing test ([5b9ae4c](https://github.com/FreshMag/testo/commit/5b9ae4c90f8639ae626390794ea70ab7e9fe7a4f))
* added failing test ([cd34865](https://github.com/FreshMag/testo/commit/cd348657e050a361422d9db4282093ab657c60d2))
* added failing test to check pr ([819289c](https://github.com/FreshMag/testo/commit/819289c3bbf7552fbf2171bc56b1ff99385d8c5a))
* added failing test to check pr ([adbd399](https://github.com/FreshMag/testo/commit/adbd399e15fdb98f82ec800d3fb791a9023f9a3a))
* removed failing test ([3b628c0](https://github.com/FreshMag/testo/commit/3b628c04c10ac0b3172fded57da027b24d62a38a))
* removed failing test ([1a0a90c](https://github.com/FreshMag/testo/commit/1a0a90cbf622b858249126e0910427afdfa7dcad))

### Build and continuous integration

* added needs for test job ([112cdbd](https://github.com/FreshMag/testo/commit/112cdbdf75ad1f2d417fe44b78f5901abcda8ed7))
* added needs for test job ([98abd2d](https://github.com/FreshMag/testo/commit/98abd2de9b9c5c510fc76d94bfa7c87eee9967ed))
* **deps:** update actions/checkout action to v4.2.2 ([97d66d4](https://github.com/FreshMag/testo/commit/97d66d4e02ad72eb2e3db52500a7da878bf5c84c))
* **deps:** update actions/setup-node action to v4.0.4 ([676f1c4](https://github.com/FreshMag/testo/commit/676f1c4bf02675b287d98d54fd6a7c3efa7a4c90))
* **deps:** update actions/setup-node action to v4.1.0 ([4869bfc](https://github.com/FreshMag/testo/commit/4869bfc003ab244eab71541f35f9e84c6efff451))
* **deps:** update dependency ubuntu to v24 ([42cd30d](https://github.com/FreshMag/testo/commit/42cd30d07ee66242fcdc50d5e36791d9aec74ae5))
* **Mergify:** configuration update ([d42885b](https://github.com/FreshMag/testo/commit/d42885b56438a99c23b1bc3acba74cd9df2897f5))
* tried wrapping bugged line with an if statement ([a7d915c](https://github.com/FreshMag/testo/commit/a7d915cb4e491ff37b6eca1e6ee7f40790f95e38))
* tried wrapping bugged line with an if statement ([521353e](https://github.com/FreshMag/testo/commit/521353e6e5c2c4b079cb9936c3606d7428e6277e))

### Style improvements

* fixed style violation ([3e82d95](https://github.com/FreshMag/testo/commit/3e82d95d158151247fffa8edfbd1ba45455b447b))
* fixed style violation ([f408313](https://github.com/FreshMag/testo/commit/f4083136fd56d75af465313eda3bd1f717bcbfcb))

## [1.14.3](https://github.com/FreshMag/testo/compare/1.14.2...1.14.3) (2025-01-06)

### Bug Fixes

* modified secrets name ([77b136f](https://github.com/FreshMag/testo/commit/77b136fcff0824ca6662cf8d40819429e37ab86e))

### Build and continuous integration

* added github package deploy ([9d0157f](https://github.com/FreshMag/testo/commit/9d0157f3391d8bb0db81d86693ef3c629c0fa4a9))

## [1.14.2](https://github.com/FreshMag/testo/compare/1.14.1...1.14.2) (2025-01-06)

### Bug Fixes

* dummy commit ([c716ded](https://github.com/FreshMag/testo/commit/c716dedb4e5d3d3fe702e2a60625cdf6f1d3d856))

### Build and continuous integration

* removed hard-coded coordinates, re-added caching for setup-gradle ([ab9be39](https://github.com/FreshMag/testo/commit/ab9be39e765e811d6d0457841a41dc8a18b7164e))

## [1.14.1](https://github.com/FreshMag/testo/compare/1.14.0...1.14.1) (2025-01-06)

### Bug Fixes

* dummy commit ([bfafa47](https://github.com/FreshMag/testo/commit/bfafa4779eb0961eb2ae9f8804bc8b8d4b28df0e))
* tried adding 'base' version of mavenPublish plugin ([91adf00](https://github.com/FreshMag/testo/commit/91adf0085996c9feb26b1835b8684c5cf312e4fe))

### Build and continuous integration

* added base plugin and removed debug prints ([fad8022](https://github.com/FreshMag/testo/commit/fad8022c1bf707278f3a61ea803b7424caca2ce2))
* added environment ([52389ba](https://github.com/FreshMag/testo/commit/52389ba286536c9db767983d6dae1d3b30d636a7))
* added in-memory key to environment ([4255291](https://github.com/FreshMag/testo/commit/4255291bd8377618616431c03252105603ea509d))
* added setup-java in the release job. ([4f9988f](https://github.com/FreshMag/testo/commit/4f9988fd9eea7f1851ad21ff8744e9536bb809c3))
* added sonatype host configuration of mavenPublish plugin ([3333cf7](https://github.com/FreshMag/testo/commit/3333cf718466cd122ad821b1d7460ab2b127dcc2))
* changed publish command in the ci ([029f114](https://github.com/FreshMag/testo/commit/029f11414666fc0e1a4d2334adf02ac6480fd531))
* changed publish command in the ci ([f74b345](https://github.com/FreshMag/testo/commit/f74b3459939e1c23b53052b702ac138fdfb00213))
* re added cache disabling for setup gradle ([2e1c1d2](https://github.com/FreshMag/testo/commit/2e1c1d2aea0b3aa96940a4ee7faaca4f9dcb1ec9))
* removed debug prints ([0dd03f1](https://github.com/FreshMag/testo/commit/0dd03f12332575ac335ef7c3a20c650b60140d51))
* removed parameters for setup-gradle ([f144595](https://github.com/FreshMag/testo/commit/f14459564062db614e47b6cbf0cd7a3eefc54d41))
* set CENTRAL_PORTAL as publication destination ([88d169f](https://github.com/FreshMag/testo/commit/88d169f8c28daac447d695252eff5acd81b560a7))
* tried adding a debug print and a clean build task call ([9e8ab21](https://github.com/FreshMag/testo/commit/9e8ab2103140d15cb187848e2bc4c6c9356239eb))
* tried changing setup-gradle configuration ([36a1fb5](https://github.com/FreshMag/testo/commit/36a1fb58647b67237b4ddbc4d3adf79bd9d40917))
* tried commenting test job ([02cabe1](https://github.com/FreshMag/testo/commit/02cabe12162262e0b26de332f78bf9731dab7648))
* tried re-adding setup-java ([93a1c5b](https://github.com/FreshMag/testo/commit/93a1c5bd857de328216d672237960115553ec41c))
* tried switching to another maven publish plugin ([012721f](https://github.com/FreshMag/testo/commit/012721f795f3a68ca4ce304d2709230251cc65e2))
* tried switching to another maven publish plugin ([920ea7b](https://github.com/FreshMag/testo/commit/920ea7bd568a56623d19a94c7abe8dbfabae72d6))
* tried switching to env variable ([44208b2](https://github.com/FreshMag/testo/commit/44208b2bcba5b72db28fe6e0217b5d4bfca2fe3d))
* updated adding maven publish plugin and forcibly applying mavenPublish plugin ([d3281aa](https://github.com/FreshMag/testo/commit/d3281aae96332b2a454e7753d878382c2c9910cc))

### Style improvements

* fixed style violations ([e593d63](https://github.com/FreshMag/testo/commit/e593d63303da2d36ef6e9ec0e9a6e8698a1414f3))

## [1.14.0](https://github.com/FreshMag/testo/compare/1.13.0...1.14.0) (2025-01-05)

### Features

* switched to single-module gradle build. Removed kt-mpp project helper ([043c8b8](https://github.com/FreshMag/testo/commit/043c8b8df6b0c6a6cba71fd620a6a9a6d2f4d78a))

### Bug Fixes

* fixed missing gradle task in the CI ([2663e0b](https://github.com/FreshMag/testo/commit/2663e0ba37cb43217bf9cf80b138a31ebd24de31))
* updated versions ([c68a6f0](https://github.com/FreshMag/testo/commit/c68a6f05826170071f6ae3cbc6569992a458516e))

### Build and continuous integration

* converted release.config.js to extension mjs ([830fd70](https://github.com/FreshMag/testo/commit/830fd70d5d3d0c4eb7e440783c16b3c869b70e91))
* converted release.config.mjs using mjs syntax ([912a8f5](https://github.com/FreshMag/testo/commit/912a8f5786aa4d2aa1e60cccb6735d3ad64b396c))
* fixed java versions in the CI ([c17db9b](https://github.com/FreshMag/testo/commit/c17db9ba704b34b9c7e6095d1665f1b54c9b30d7))
* fixed missing gradle task called ([9cea244](https://github.com/FreshMag/testo/commit/9cea24422013e1e9b46d708d4b5d465402c79425))
* fixed missing gradle task called ([8340df5](https://github.com/FreshMag/testo/commit/8340df5eb1113f8de5980c052d13a1075a212f35))
* fixed missing job 'build' ([ed2716c](https://github.com/FreshMag/testo/commit/ed2716c0639d69bc288875e0982e34dce7c08ccc))
* fixed old call to gradle task that was using missing submodule ([b87248e](https://github.com/FreshMag/testo/commit/b87248e78b922c8b697eb5284de79ae382c35217))
* fixed version of node retrieval. Added debug print. ([3df64c2](https://github.com/FreshMag/testo/commit/3df64c21260eb0402205a2bce8027d92b29c63ad))
* set publish-on-maven job java version to 21 ([ec8fd3e](https://github.com/FreshMag/testo/commit/ec8fd3ee07a7cfea86f80a7037ac41d1911b7f41))
* try adding package-lock.json from template project ([db39f4b](https://github.com/FreshMag/testo/commit/db39f4bc2ae9cf4c3bb0d43745e1b087744cf4bf))
* try deleting package-lock.json ([e7225c1](https://github.com/FreshMag/testo/commit/e7225c1b3255c9e7cdecf593c1a1590d197737ac))
* updated 'success' job needs ([ae7b494](https://github.com/FreshMag/testo/commit/ae7b4947d3dad2d63e9295864c01f0151fb82313))
* updated "precompute-semantic-release-version" ([cf0d376](https://github.com/FreshMag/testo/commit/cf0d376aed19292e6b4f839356a88942f5a8cc10))
* updated package-lock.json ([367f767](https://github.com/FreshMag/testo/commit/367f767a14ccac4269801f30c38affdb24285e62))

### General maintenance

* removed unused stuff ([443ea06](https://github.com/FreshMag/testo/commit/443ea064ecd7e11d9b4ac78299bc61034313a796))

## [1.13.0](https://github.com/FreshMag/testo/compare/1.12.4...1.13.0) (2025-01-04)


### Features

* updated CI and build file including correct publishing and building ([f2e1bcd](https://github.com/FreshMag/testo/commit/f2e1bcd878560e41a9f3e39b669d35f44ff749f3))

## [1.12.4](https://github.com/FreshMag/testo/compare/1.12.3...1.12.4) (2024-12-29)


### Bug Fixes

* dummy commit ([a0f5345](https://github.com/FreshMag/testo/commit/a0f5345492669a52f89c83ec04b1cb9870a84f15))

## [1.12.3](https://github.com/FreshMag/testo/compare/1.12.2...1.12.3) (2024-12-29)


### Bug Fixes

* added environment variable ([e292201](https://github.com/FreshMag/testo/commit/e292201b335c40ca8df87c64581007c088e8008c))

## [1.12.2](https://github.com/FreshMag/testo/compare/1.12.1...1.12.2) (2024-12-29)


### Bug Fixes

* fixed missing parameter to checkout action ([963c85c](https://github.com/FreshMag/testo/commit/963c85c9f8ea3b7830831da18c370ca9a00d1913))

## [1.12.1](https://github.com/FreshMag/testo/compare/1.12.0...1.12.1) (2024-12-29)


### Bug Fixes

* fixed missing name in package.json ([469342c](https://github.com/FreshMag/testo/commit/469342cfc8f251d63597f48130d553f43943b7b7))

## [1.12.0](https://github.com/FreshMag/testo/compare/1.11.1...1.12.0) (2024-12-29)


### Features

* added fatJar plugin and release in the CI ([16998d9](https://github.com/FreshMag/testo/commit/16998d9086a884280e977d36a568b488461cb05e))


### Bug Fixes

* fixed new module causing issues with the shadow pluing ([78a85aa](https://github.com/FreshMag/testo/commit/78a85aad7aaff372fe0e97125d3a0f5a30791801))
* removed failing command in the ci ([6d89783](https://github.com/FreshMag/testo/commit/6d897839515e0f9f227a18dd429ec54b248ecc76))


### Build and continuous integration

* added module 'app' ([b9468b4](https://github.com/FreshMag/testo/commit/b9468b46e5d81f8b083b4e819c14e39563e293b8))

## [1.11.1](https://github.com/FreshMag/testo/compare/1.11.0...1.11.1) (2024-12-28)


### Bug Fixes

* bad syntax inside package.json ([ac98140](https://github.com/FreshMag/testo/commit/ac981408b8f89c7e8959213b7539e367f3cd4e27))
* updated the ci with permissions for semantic-release ([de0dacb](https://github.com/FreshMag/testo/commit/de0dacb7bbb59bf24dd4a8862b7245415fee190d))

## [1.11.0](https://github.com/FreshMag/testo/compare/1.10.0...1.11.0) (2024-12-28)


### Features

* dummy commit ([f724dae](https://github.com/FreshMag/testo/commit/f724dae10b9563233b5dfa4a65c6d670ac9e508f))


### Build and continuous integration

* added npmPublish block inside build.gradle.kts ([7a730fc](https://github.com/FreshMag/testo/commit/7a730fc5ec7839600c4cb84f14f2c1ad4beff4d5))

## [1.10.0](https://github.com/FreshMag/testo/compare/1.9.0...1.10.0) (2024-12-28)


### Features

* removed debug line, added author and publishConfig ([31ba5f4](https://github.com/FreshMag/testo/commit/31ba5f47788d8fd62f02c06cd27654232a09ffe2))

## [1.9.0](https://github.com/FreshMag/testo/compare/1.8.0...1.9.0) (2024-12-28)


### Features

* added debug command inside release.config.js ([c261583](https://github.com/FreshMag/testo/commit/c261583654f7604d115555cfc767de971d90f2f8))

## [1.8.0](https://github.com/FreshMag/testo/compare/1.7.0...1.8.0) (2024-12-28)


### Features

* dummy commit ([73af9f8](https://github.com/FreshMag/testo/commit/73af9f876f4c5a0b97481325d2655c74c3f29dab))


### General maintenance

* updated CHANGELOG.md ([355ee74](https://github.com/FreshMag/testo/commit/355ee749a287a3f10c397dd77cf526e2f93a7568))


### Refactoring

* removed unused line in build.gradle.kts ([02b2ba0](https://github.com/FreshMag/testo/commit/02b2ba0e83c9798a17088befab2539f84357f980))

## [1.7.0](https://github.com/FreshMag/testo/compare/1.6.0...1.7.0) (2024-12-28)


### Features

* modified gradle build by using Plugins of kt-mpp ([42b376d](https://github.com/FreshMag/testo/commit/42b376d7100041b277aa41e7808632afc0a0126a))

## [1.6.0](https://github.com/FreshMag/testo/compare/1.5.0...1.6.0) (2024-12-27)


### Features

* removed npm from release.config.js ([62558b6](https://github.com/FreshMag/testo/commit/62558b65664dc38f239d105eb0ed2939b6887750))


### General maintenance

* merge ([9109216](https://github.com/FreshMag/testo/commit/9109216646c60be00e6382bda7292b3ad8791ab5))

## [1.5.0](https://github.com/FreshMag/testo/compare/1.4.0...1.5.0) (2024-12-27)


### Features

* modified name in package.json ([2ed03fe](https://github.com/FreshMag/testo/commit/2ed03fe331a4cf97b9302158f3546793b3554663))


### Build and continuous integration

* adjusted setup-node registry, modified release.config.js ([c3b922d](https://github.com/FreshMag/testo/commit/c3b922de2d868bac7bd7099d7ceacda34bd18ed5))

## [1.4.0](https://github.com/FreshMag/testo/compare/1.3.0...1.4.0) (2024-12-27)


### Features

* updated ci ([822ceaf](https://github.com/FreshMag/testo/commit/822ceafa50adb7dde803f7e63dd7b3cba235a3cc))


### General maintenance

* updated CHANGELOG.md ([5da3669](https://github.com/FreshMag/testo/commit/5da36696ae046f257c68a61950ee266a50f88e51))

## [1.3.0](https://github.com/FreshMag/testo/compare/1.2.0...1.3.0) (2024-12-27)


### Features

* updated ci ([620e5d4](https://github.com/FreshMag/testo/commit/620e5d4024410afb2c607f4cc39b063e6bbdc6bf))

## [1.2.0](https://github.com/FreshMag/testo/compare/1.1.0...1.2.0) (2024-12-27)


### Features

* dummy commit ([0974a7f](https://github.com/FreshMag/testo/commit/0974a7f2b2218989f1530bdc16341cc903df62d6))


### Build and continuous integration

* added node token to ci ([ccac4cc](https://github.com/FreshMag/testo/commit/ccac4cc357aa329f3eb92b90aec9c1fab2bc4d20))

## [1.1.0](https://github.com/FreshMag/testo/compare/1.0.0...1.1.0) (2024-12-27)


### Features

* test commit for release ([fc00724](https://github.com/FreshMag/testo/commit/fc00724b392b4563f6592740fab475407e03a632))


### Build and continuous integration

* added npm publish plugin ([6248f3b](https://github.com/FreshMag/testo/commit/6248f3bea5bcc06e0f5c560846dee3fcdef80752))

## 1.0.0 (2024-12-27)


### Bug Fixes

* fixed broken versions and imports ([66e594f](https://github.com/FreshMag/testo/commit/66e594f5cff786703cdf6a5c435d47ff6f317665))


### Build and continuous integration

* added publishOnCentral block ([71a4557](https://github.com/FreshMag/testo/commit/71a4557e12cd9d6a840b07ee64afaa312f579a8e))
* added the plugin publishOnCentral for submodule example ([a96c6fb](https://github.com/FreshMag/testo/commit/a96c6fb9e03a5214c231e71a201c8ecafe005947))
* added token to action environment ([154eaf9](https://github.com/FreshMag/testo/commit/154eaf9bba316c2a081c6f4d000f6f7c869dd59d))
* changed CI Maven username ([7e99c17](https://github.com/FreshMag/testo/commit/7e99c1725c6e492a3fc39c58840721bb714731e8))
* changed CONTRIBUTORS and settings.gradle.kts project name ([b1f33ee](https://github.com/FreshMag/testo/commit/b1f33eec12cd55b9227a78a7c0377c8953166b6f))
* changed maven publish plugin ([61b3930](https://github.com/FreshMag/testo/commit/61b393023b98630495e1825e0e01b50db2b8ef6e))
* commented failing secret retrieval ([1b7059a](https://github.com/FreshMag/testo/commit/1b7059ab8bc68a24fa0a35d4c2a0a57c98ca0fbc))
* first try adding release section to ci ([aefe718](https://github.com/FreshMag/testo/commit/aefe718ef5273ec7a4ce0f481643d721be1f846d))
* fixed script syntax ([cbe862e](https://github.com/FreshMag/testo/commit/cbe862e82912b36cb54cbf577cf75700fd00369c))
* fixed script syntax ([e5dc076](https://github.com/FreshMag/testo/commit/e5dc07660d3ad87b488178f1c6e9f2b9aa08bb8f))
* fixed syntax error ([02c2e99](https://github.com/FreshMag/testo/commit/02c2e9940c99b7f4c7588d5a23fcb1480d4d5318))
* modified ci for maven publish ([4a91c9b](https://github.com/FreshMag/testo/commit/4a91c9b0b3ed2c5a643089bb155efe303254a80c))
* modified README, added logo ([667080c](https://github.com/FreshMag/testo/commit/667080c78fcefb182ca8cc3c35938a34fb0e4838))
* modified signing_key retrieval ([11c5238](https://github.com/FreshMag/testo/commit/11c523896e5c10c46fba032db1e33145e010f1fb))
* removed absent task call ([1a4d34c](https://github.com/FreshMag/testo/commit/1a4d34cf181414e5569bb5527016b5c781940537))
* removed section in build.gradle.kts ([1db9be9](https://github.com/FreshMag/testo/commit/1db9be96a3d49839ed22f55b6e72b0f9a7dfb5cc))
* removed white spaces and unused dependency ([629a56c](https://github.com/FreshMag/testo/commit/629a56cf7a470f9fdad456cc953d22105c408340))
* replaced composite action with simpler, direction action step for semantic release ([317322e](https://github.com/FreshMag/testo/commit/317322eb92f5ada6ae70e9a5d7dbad563a3d58db))


### Refactoring

* commented out non-compiling 'addFirst' method ([2c9c87e](https://github.com/FreshMag/testo/commit/2c9c87e4e5638b85e09bf8ba0660f95ffc1e79d4))
