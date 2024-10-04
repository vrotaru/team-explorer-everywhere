## TEE plugin for Modern (as of 2024-09) Eclipse.

Original README can be found in [here](./README.orig.md)

### Non goals.

Port the whole *TEE* project with automatic builds for both plugin and cli versions of the software or a large number of Eclipse versions.

### Goals

Have a way to produce a TEE plugin which can used with recent versions of Eclipse. Even if the build process is manual.

And it is. But the steps are rather simple. Especially if you have some experience with building Eclipse plugins.

1. Install an Eclipse version with support for plugin development.
1. Clone this repository.
1. Start Eclipse and import everything _As Existing Project_ in [`source`](./source) folder.
1. Open the `com.microsoft.tfs.client.eclipse.feature` and in this project double-click on the `feature.xml` file.
1. On the top-right corner of the feature editor you will see a icon with the tooltip `Export a deployable feature`
1. Click on it and export to a directory.

That's it. Now you have a local update site from which you can install TEE into your Eclipse.
