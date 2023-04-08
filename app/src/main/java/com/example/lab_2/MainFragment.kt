package com.example.lab_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var musicList:List<music>
    private lateinit var MusicAdapter:MusicAdapter
    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        recyclerView = view.findViewById(R.id.recyclerview)
//        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        musicList = mutableListOf<music>(
            music("https://i.scdn.co/image/ab67616d0000b273a1c37f3fd969287c03482c3b", "Lana Del Rey - National Anthem", "The concept of this song seems to involve Lana expressing her feelings for two distinct lovers, alluding to the life and death of President John F. Kennedy and the love triangle in between. Mr. Kennedy’s love for Hollywood starlet Marilyn Monroe was fun, crazy and passionate. This may have been charged even more so by the fact that it was an affair “behind closed doors” and one with one of the most sought after women in the world at the time. Marilyn was seemingly more sporadic, eccentric and glamorous; exactly the opposite of Jackie Kennedy. But to Mr. Kennedy they were both meaningful parts of his life and great lovers."),
            music("https://upload.wikimedia.org/wikipedia/en/6/6a/UltraviolenceLDR.png", "Lana Del Rey - Ultraviolence", "“Ultraviolence” is the title track of Lana Del Rey’s third full-length LP and was released as a promotional single. Lana first utilized the term ultraviolent in an unreleased song entitled “Hundred Dollar Bill.”In a Kulturnews interview, Lana said that “Ultraviolence” was about a cult leader she met as a member of underground group in New York.It is speculated that she is talking about Atlantic Group, a part of Alcoholics Anonymous, which she joined in the past. They were notorious for their cult behaviour and poor treatment of older men and young women. The Pacific Group (which AG is a branch of) is partly run by a man named Jim, which is name of the character referenced in the song. The lyric could also reference Jim Jones, an infamous cult leader who led a mass suicide of his followers in 1978."),
            music("https://upload.wikimedia.org/wikipedia/en/6/6a/UltraviolenceLDR.png", "Lana Del Rey - Brooklyn Baby", "“Brooklyn Baby” is the fourth single released from Lana Del Rey’s third studio album, Ultraviolence. Like much of her music, it is steeped in nostalgia for an earlier period in American history.Like “National Anthem”, “Brooklyn Baby” appears to be partially satirical or entirely satirical, as Rolling Stone has interpreted it. It describes a cool, young girl who brags about her musician boyfriend, her rare jazz collection, and her hydroponic weed, seeming to simultaneously lampoon and celebrate these typically “Brooklyn” preoccupations.The track was written by Lana Del Rey and her ex-boyfriend, Barrie-James O'Neill.In a Guardian interview, Del Rey said she was originally meant to record the song with Lou Reed of the Velvet Underground; Reed died the day of the planned recording."),
            music("https://upload.wikimedia.org/wikipedia/en/c/c1/The_Weeknd_-_After_Hours.png", "The Weeknd - After Hours", "“After Hours” is the title track and the third promotional single for The Weeknd’s fourth studio album After Hours. The song addresses a failed relationship that ended in heartbreak and serves as an apology letter for his past transgressions, as he desires reconciliation. Additionally, the song’s dark vibes and altered vocals over hard-hitting production are reminiscent of styles seen on Abel’s earlier music such as November 2012’s Trilogy. The track is also thematically similar to songs from that era, as he once again details the pain and anguish associated with heartbreak.On February 18, 2020, the day before the track’s release, Abel revealed the album’s cover art and teased the track’s release date via social media."),
            music("https://upload.wikimedia.org/wikipedia/en/3/39/The_Weeknd_-_Starboy.png", "The Weeknd - Die For You", "On “Die For You” The Weeknd croons about the conflicting feelings and pain that comes with letting go of someone he still has intense feelings for. Many fans speculate the song was written about Abel’s then ex-girlfriend, supermodel Bella Hadid following rumors, that the two ended their relationship close to Starboy’s official release due to their conflicting work schedules. Additionally, Abel admitted to Zane Lowe in an interview that the song was finished a mere week before the album’s release, raising more suspicions that he’d written the song about a recent split. On 11/25/2021, the fifth anniversary of Starboy, a music video was at last released for the track. In February 2023, The Weeknd released a remix of the track featuring Ariana Grande, their first collaboration since their hit remix of Abel’s track Save Your Tears."),
            music("https://upload.wikimedia.org/wikipedia/en/4/4d/MyDearMelancholy_-_album_by_The_Weeknd.jpg", "The Weeknd - Wasted Times", "“Wasted Times” sees The Weeknd putting his two high-profile relationships with Bella Hadid and Selena Gomez in perspective. It can be inferred from lines referencing her past as an equestrian that the girl that The Weeknd is reminiscing about is Bella. Moreover, he and Bella recently reconnected."),
            music("https://upload.wikimedia.org/wikipedia/en/1/15/The_Neighbourhood_-_Wiped_Out.jpg", "The Neighbourhood - The Beach", "“The Beach” talks about feeling ashamed of having feelings for a friend. The song was the second release by California natives The Neighbourhood in anticipation for their sophomore album. Zane Lowe premiered the track on his Beats 1 Radio Show on September 24th, 2015, and it became available as a pre-order single the next day.The band posted the official lyrics on their Instagram."),
            music("https://upload.wikimedia.org/wikipedia/en/1/15/The_Neighbourhood_-_Wiped_Out.jpg", "The Neighbourhood - Prey", "“Prey” plays around with the homophone “pray” and blurs the lines which define their differences.Guitarist Jeremy Freedman spoke with The Seventh Hex about what type of energy the band was trying to create through this song: [“Prey”] started with the “stabby” guitar riff that you hear on the verses, and Motown was a reference that got thrown around by a few different people in the band when the song was being written. Even if that was the case I think we came a long way from Motown in that song. I’m sure everyone would agree. We were all on the same page that we wanted this song to be a rock song but lo-fi and cool.The Neighbourhood released “Prey” as the third single from their sophomore album, Wiped Out! Zane Lowe premiered the track on his Beats 1 Radio Show on October 14th, 2015, making “Prey” the band’s second World Premiere record."),
            music("https://upload.wikimedia.org/wikipedia/en/e/ec/The_Neighbourhood_-_The_Neighbourhood.jpg", "The Neighbourhood - Nervous", "“Nervous” premiered on Beats 1 Radio with Zane Lowe on March the 1st, 2018. It is the second single from the band’s self-titled third studio album The Neighbourhood. The song is the brainchild of frontman Jesse Rutherford and producer Benny Blanco. “Nervous” features heavy R&B influence and washed out guitars reminiscent to their previous record Wiped Out!")
        )
        val MusicAdapter = MusicAdapter(musicList) { selectedMusic: music ->
            listItemClicked(selectedMusic)
        }
        recyclerView.adapter = MusicAdapter
    }
    fun listItemClicked(selectedItem:music){

        val bundle = Bundle().apply {
            putString("Music URL", selectedItem.imageurl)
            putString("Music Name", selectedItem.name)
            putString("Music Description", selectedItem.description)
        }
        navController!!.navigate(R.id.action_mainFragment_to_secondFragment, bundle)
    }
}