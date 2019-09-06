import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
  const val guava: String = "15.0"

  const val guice: String = "2.0" // available: "3.0"

  const val io_vertx_vertx_plugin_gradle_plugin: String = "0.3.1" // available: "0.8.0"

  const val vertx_core: String = "none"// No version. See buildSrcVersions#23

  const val vertx_stack_depchain: String = "3.6.2"

  /**
   *
   * See issue 19: How to update Gradle itself?
   * https://github.com/jmfayard/buildSrcVersions/issues/19
   */
  const val gradleLatestVersion: String = "5.6.1"

  const val gradleCurrentVersion: String = "5.6.1"
}