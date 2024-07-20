# IFSPEC Benchmark suite

**IFSpec is a collection of micro-benchmarks of information-flow vulnerabilities in Java and Android programs.**

IFSpec benchmarks are provided in three formats: Java source code, Java bytecode and Dalvik bytecode.
Each benchmark includes ground truth, description, and identified sources and sinks.
The benchmark suite was introduced in ["A Uniform Information-Flow Security Benchmark Suite for Source Code and Bytecode"](https://doi.org/10.1007/978-3-030-03638-6_27).

### Sample tags and their distribution

| Tag                | Samples | Types of information flow covered                   | Explicit flows | Implicit flows |
|:-------------------|:--------:|:----------------------------------------------------|:---------------:|:--------------:|
| simple             |    18    | simple information flow not covered by tags below   |        ✓        |                |
| high-conditional   |    11    | information flow via secret-dependent conditionals  |                 |       ✓        |
| arrays             |    12    | information flow involving array length and content |        ✓        |       ✓        |
| class-initializers |    7     | information flow involving class initializers       |        ✓        |       ✓        |
| exceptions         |    11    | information flow via exception handling             |                 |       ✓        |
| library            |    7     | information flow involving library calls            |        ✓        |       ✓        |
| aliasing           |    11    | information flow involving object aliasing          |        ✓        |       ✓        |
| reflection         |    7     | information flow involving reflection               |        ✓        |       ✓        |
|                    |          | **TOTAL**                                           |     **46**      |     **34**     |                                            

This repository contains all benchmarks as-is, without modification.
This repository does not include the tested tools or scripts to reproduce the results presented in the original paper;
refer to the [original artifact](https://www.spp-rs3.de/IFSpec) to obtain tools and reproduction scripts.

* About [RIFL Specification Language](https://publikationen.bibliothek.kit.edu/1000092713)
* [Modifications notes](adjusted_securibench_micro_classifications.txt) to SecuriBench benchmarks
* For licensing terms see [LICENSE](LICENSE.md)
