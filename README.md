> **archived.** this repository is not maintained: 2 commits, of september 2020. nothing here was built or run again for this notice, so read it as a record and not as a tool.
>
> its own description: "che test". it is mostly Shell and Scala. its licence is MIT.
>
> where the work is now:
>

| what | where |
|---|---|
| the whole story, with every work | [h0ffmann.github.io/h0ffmann](https://h0ffmann.github.io/h0ffmann/), doi [10.5281/zenodo.23352630](https://doi.org/10.5281/zenodo.23352630) |
| the sea, in Scala 3 | [marola.dev](https://marola.dev), doi [10.5281/zenodo.23224155](https://doi.org/10.5281/zenodo.23224155) |
| a wave model on GPUs | [ww3-gpu](https://h0ffmann.github.io/ww3-gpu/), doi [10.5281/zenodo.23221351](https://doi.org/10.5281/zenodo.23221351) |
| a benchmark for forecasts of the brazilian coast | [marola-bench](https://github.com/marola-dev/marola-research/tree/main/marola-bench), doi [10.5281/zenodo.23352633](https://doi.org/10.5281/zenodo.23352633) |
| the tools that build the rest | [picasso](https://github.com/h0ffmann/picasso), doi [10.5281/zenodo.23311208](https://doi.org/10.5281/zenodo.23311208) |
| a book on closed source | [closed source: the god that failed](https://h0ffmann.github.io/closed-source/), doi [10.5281/zenodo.23333656](https://doi.org/10.5281/zenodo.23333656) |

---

# Eclipse Che IDE 

A simple Scala "Hello World!" application, buildable with sbt. Useful for testing Eclipse Che Scala workspaces.


# Building manually

| Task  | Command             | Real command
| ----- | ------------------- | -------------
| Build | ~~`sbt compile` ~~  | ./sbt compile
| Run   | ~~`sbt run` ~~      | ./sbt run


# Problems

- [x] Init project not working
- [ ] Sbt shell not working
- [ ] Support for code dependecy navigation (even with .withSources() downloaded seems to not work properly)

