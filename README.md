Main problem: DI isn't happening. Run 'mvn clean test' and there's no injection, leading to Null Pointer exception


I started using weld-se rather than weld-core, but that led to weird exceptions at startup which disappeared when I
removed Selenium from the POM. This example doesn't use Selenium, but the actual example I want to write does.