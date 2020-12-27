<template>
  <div class="home">
      <h1 class="subtitle-1 grey--text">Dashboard Page</h1>

      <v-container fluid class="my-5" grid-list-md>
        <v-expansion-panels multiple v-model="panel">

        <v-layout row wrap>
          <v-flex md6 xs12>
              <v-expansion-panel expand>
                <v-expansion-panel-header>
                  Item
                </v-expansion-panel-header>
                <v-expansion-panel-content>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </v-expansion-panel-content>
              </v-expansion-panel>
            </v-flex>
         <v-flex md6 xs12>
              <v-expansion-panel>
                <v-expansion-panel-header>
                  Item
                </v-expansion-panel-header>
                <v-expansion-panel-content>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </v-expansion-panel-content>
              </v-expansion-panel>
            </v-flex>
          <v-flex md6 xs12>
              <v-expansion-panel>
                <v-expansion-panel-header>
                  Item
                </v-expansion-panel-header>
                <v-expansion-panel-content>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </v-expansion-panel-content>
              </v-expansion-panel>
            </v-flex>
          <v-flex md6 xs12>
              <v-expansion-panel>
                <v-expansion-panel-header>
                  Item
                </v-expansion-panel-header>
                <v-expansion-panel-content>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </v-expansion-panel-content>
              </v-expansion-panel>
            </v-flex>
        </v-layout>
        </v-expansion-panels>

      </v-container>


  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Dashboard',
  data (){
    return {
      panel:[0,1,2,3]
    }
  }
}
</script>
